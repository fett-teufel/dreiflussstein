import dev.roteblume.dreifflusstein.schachkbrett.Application
import kotlinx.browser.document
import react.dom.render

fun main() {
    render(document.getElementById("root")) {
        child(Application::class) {}
    }
}