# Expansion-mUnix
Very simple external expansion for PlaceholderAPI, which allows parsing unix time (millis, secs, mins).

UNIX time in short is how much time elapsed since 1st January 1970 (UTC).

Current unix time: https://www.unixtimestamp.com/ 

# Requirements
* Java 19
* PlaceholderAPI (Used dependency is v2.11.5)
* Bukkit based server (Feel free to use forks - Spigot, Paper, etc.)

# Installation
1. Download latest .jar file.
2. Place it into `/plugins/PlaceholderAPI/expansions`
3. `/papi register Expansion-munix-<version>.jar`  
3.1. You don't need to register manually, if you just reboot server / reload PAPI.
5. Enjoy!

# Usage
* `%<name>_<parameter>%`
* `%munix_millis%` -> Returns milliseconds elapsed since 1/1/1970. 
* `%munix_seconds%` -> Returns seconds elapsed since 1/1/1970.
* `%munix_minutes%` -> Return minutes elapsed since 1/1/1970.
* Invalid parameter will return: "Invalid identifier, use: millis, seconds, minutes"

# Parameters
Only available parameters are:
* millis
* seconds
* minutes
