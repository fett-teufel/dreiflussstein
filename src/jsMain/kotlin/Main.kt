import dev.roteblume.dreifflusstein.schackbrett.Application
import kotlinx.browser.document
import react.dom.render

fun main() {
    render(document.getElementById("root")) {
        console.log("YOOUUHUU")
        child(Application::class) {}
    }
}