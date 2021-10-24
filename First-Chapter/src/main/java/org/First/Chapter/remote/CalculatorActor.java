package org.First.Chapter.remote;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import org.Chapter8.client.Messages;


public class CalculatorActor extends UntypedActor {

	private LoggingAdapter log = Logging.getLogger(getContext().system(), this);

	// private ActorRef loggingActor =
	// getContext().actorOf(Props.create(LoggingActor.class), "LoggingActor");

	@Override
	public void onReceive(Object message) throws Exception {
		log.info("onReceive({})", message);

		if (message instanceof Messages.Sum) {
			log.info("got a Sum message");
			Messages.Sum sum = (Messages.Sum) message;

			int result = sum.getFirst() + sum.getSecond();
			getSender().tell(new Messages.Result(result), getSelf());
			System.out.println("sub over");

			// loggingActor.tell(sum.getFirst() + " + " + sum.getSecond() + " = " + result,
			// getSelf());
		} else {
			unhandled(message);
		}
	}
}
