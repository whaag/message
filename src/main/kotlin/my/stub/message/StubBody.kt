package my.stub.message

import java.time.LocalDateTime

data class StubBody(val lastReceivedMail: LocalDateTime, val lastReceivedSms: LocalDateTime, val unreadMailCount: Int, val unreadSmsCount: Int)