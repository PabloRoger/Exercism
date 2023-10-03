import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneOffset

class Gigasecond(
    input: LocalDate,
) {
    var date: LocalDateTime

    constructor(input: LocalDateTime) : this(input.toLocalDate()) {
        this.date = calculateGigasecondDate(input)
    }

    init {
        this.date = calculateGigasecondDate(input.atStartOfDay())
    }

    private fun calculateGigasecondDate(input: LocalDateTime): LocalDateTime {
        val gigasecond: Long = 1000000000 // 1.000.000.000 seconds
        val gigasecondDate: LocalDateTime = input.plusSeconds(gigasecond)

        val offset = ZoneOffset // difference between local time and UTC time
            .from( // extract the time compensation of specific time zone
                input.atZone( // convert date and hours to specific time zone
                    ZoneOffset.systemDefault(), // time zone by default for the system
                ),
            )

        return gigasecondDate
            .atOffset(offset) // adjust the time and hours calculated to set up the time zone properly
            .toLocalDateTime()
    }
}
