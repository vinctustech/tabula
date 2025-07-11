package com.vinctus.scandas

import java.time.{Duration, Instant, LocalDateTime, ZoneOffset}
import java.time.temporal.ChronoUnit.*
import java.time.format.DateTimeFormatter

@main def run(): Unit =

//  val ds = Dataset(
//    Seq("col1", "col2"),
//    for (r <- 1 to 3) yield for (c <- 1 to 2) yield if r == c then s"$r.$c" else s"$r$c",
//  )

//  val ds = Dataset.fromCSV("iris.csv")

//  val ds = Dataset(
//    Seq("Value"),
//    Seq(2, 4, 6, 8, 13, 16, 22, 35, 40, 42, 48).map(Seq(_)),
//  )

//  val ds = Dataset.fromCSV("iris.csv")
//
//  ds.info()

//  val ds = Dataset(
//    Map(
//      "col1" -> Seq(1, 15, 2, 2, 2, 3, 1, 1, 2, 2, 2, 3, 1, 1, 2),
//      "col2" -> Seq(1, 2, 12, 2, 2, 3, 1, 1, 2, 2, 2, 3, 1, 1, 2),
//    ),
//  )
//
//  ds.describe.print()
//
//  val ds1 = ds((ds.zcode.abs < 3).all)
//
//  println(ds1.describe)

//  val ds = Dataset(Map("col1" -> Seq(3, 4, 5, 6)))
//
//  ds.describe.print()

//  val sql = "select t.scheduled_at, t.confirmed_at, t.finished_at, t.predicted_duration from trips t"

//    """select t.scheduled_at, t.confirmed_at, t.finished_at, t.predicted_duration
//      |    from trips t
//      |    join workflows w on w.id = t.workflow_id
//      |    join stores s on s.id = t.store_id
//      |    join accounts a on a.id = s.account_id
//      |    where a.name = 'Honda of Pasadena' and
//      |          w.name = 'Shuttle Pickup' and
//      |          t.state = 'COMPLETED' and t.scheduled_at is not null
//      |      and t.confirmed_at is not null""".stripMargin

//  val ds =
//    PG.query(
//      sql,
//      "localhost",
//      "shuttlecontrol",
//      "shuttlecontrol",
//      "shuttlecontrol",
//      5433,
//    )
//
//  println(ds)
//  ds.describe.print()

//  val ds = Dataset.fromTabFile("cats", "cats-weight.tab")
//
//  println(ds)
//  ds.info()

//  val ds = Dataset.fromCSVString("""
//      |time
//      |2018-08-22T19:10:53.095-04
//      |2018-08-22T19:10:53.094Z
//      |2018-08-22T19:10:53.094Z
//      |""".trim.stripMargin)
//
//  println(ds)
//  ds.info()

//  val ds = Dataset("asdf", 3 to 7)
//
//  println(ds.split(40, 60))

//  val n = Instant.now
//  val ds1 = Dataset("times", Seq(n, n.plus(5, SECONDS)))
//  val ds2 = Dataset("times", Seq(n.plus(6, SECONDS), n.plus(7, SECONDS)))
//
//  println((ds1 - ds2).rename("newColumn"))

  val data = Dataset.fromCSVFile("trips100.csv")

  println(data)
  data.info()

//  val trips = (data append (data.confirmed_at - data.finished_at).rename("duration"))
//    .drop("requested_at", "confirmed_at", "finished_at")
//
//  //  println(ds)
//  //  ds.info()
//  println(trips.describe)
//  println(
//    trips(
//      (trips.zcode.abs < 3).all,
//    ).describe,
//  )
