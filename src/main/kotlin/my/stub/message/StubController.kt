package my.stub.message

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class StubController {

@GetMapping("/control/comms/threads/unread-count")
fun stub() : StubBody {
    return StubBody(LocalDateTime.now(), LocalDateTime.now(), 0, 0)
}
}