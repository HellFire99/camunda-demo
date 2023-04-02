package nl.tfg.camunda.listener

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.ExecutionListener
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class ProcesStapListener: ExecutionListener {
    private val logger = LoggerFactory.getLogger(ProcesStapListener::class.java)
    override fun notify(delegateExecution: DelegateExecution) {
        when(delegateExecution.eventName){
            "take" -> {
                logger.info("==> ${delegateExecution.eventName} ${delegateExecution.currentTransitionId}")
            }
            else ->{
                logger.info("==> ${delegateExecution.eventName} ${delegateExecution.currentActivityName}")
            }
        }


    }

}