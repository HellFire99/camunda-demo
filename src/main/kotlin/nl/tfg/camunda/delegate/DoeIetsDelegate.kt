package nl.tfg.camunda.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class DoeIetsDelegate: JavaDelegate {
    private val logger = LoggerFactory.getLogger(DoeIetsDelegate::class.java)
    override fun execute(delegateExecution: DelegateExecution) {
        logger.info("Doe ${delegateExecution.currentActivityName}")
    }
}