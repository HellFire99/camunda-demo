package nl.tfg.camunda.delegate

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class ZetStatusDelegate: JavaDelegate {
    private val logger = LoggerFactory.getLogger(ZetStatusDelegate::class.java)
    override fun execute(delegateExecution: DelegateExecution) {
        logger.info("Execute ${delegateExecution.currentActivityName}")

        val procesStatus = delegateExecution.getVariable("procesStatus") as String
        logger.info("Zet de proces status op $procesStatus")
    }
}