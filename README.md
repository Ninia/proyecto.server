# prog3_proyecto_server
[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](http://www.gnu.org/licenses/gpl-3.0)

Student project for Programming III course at Deusto University made by [Rafael Romón](https://github.com/rafaelromon), [Saul Segura](https://github.com/luasaul) and [Mikel Solabarrieta](https://github.com/mikelsr). 

## Description:
Self-Hosted Java Server that stores documents and media files, it communicates with a Java Client, this Server uses 3 databases: 

* Neo4j - Information about movies, series and music.
* MongoDB - Documents.
* DWH - Analytics (Likes, usage, etc).

<p align="center">
  <img src="https://github.com/Ninia/prog3.proyecto/blob/master/src/main/web/images/planteamiento.png" alt="Planteamiento"/>
</p>

┻┳|<br>
┳┻|<br>
┻┳|<br>
┳┻|<br>
┻┳|<br>
┳┻|<br>
┻┳|<br>
┳┻|_<br>
┻┳| •.•) &nbsp;&nbsp;&nbsp;we are working<br>
┳┻|⊂&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;on ssl<br>
┻┳|<br>

## Monitoring the Server
Some stats and conditions of the host server can be stored in [InfluxDB](
https://github.com/influxdata/influxdb),
so it's possible either to monitor them in real time or query them in a
historical database. The real time monitoring can be done using [Grafana](
http://grafana.org/).
### InfluxDB
>InfluxDB is an open-source time series database developed by InfluxData.
It is written in Go and optimized for fast, high-availability storage and
retrieval of time series data in fields such as operations monitoring,
application metrics, Internet of Things sensor data, and real-time analytics. 

Official documentation can be accessed [here](
https://docs.influxdata.com/influxdb/v1.2/).
### Grafana
>Grafana is most commonly used for visualizing time series data for Internet
infrastructure and application analytics but many use it in other domains
including industrial sensors, home automation, weather, and process control.

Official documentation can be accessed [here](
http://docs.grafana.org/).

## Recommended Installation for Server
1. Download and install [Vagrant](https://www.vagrantup.com/downloads.html)
2. Clone [our vagrant repository](
https://github.com/Ninia/p3p-vagrant) and go to that folder
3. Run `vagrant up`

**_Hopefully you're good to go!_**

## License
This project fall under the GPL 3 license fell free to use it, modify it and let us know of your changes :)

### 3rd Party Licenses
* ScriptRunner - [Source](https://github.com/BenoitDuffez/ScriptRunner) - [License](https://github.com/BenoitDuffez/ScriptRunner/blob/master/LICENSE)


