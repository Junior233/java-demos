package org.Chapter8.client;

import akka.actor.ActorSelection;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class ClientActor extends UntypedActor {
	private LoggingAdapter log = Logging.getLogger(getContext().system(), this);

	//创建远端Actor系统服务的引用
	private ActorSelection actorRef = getContext().actorSelection("akka.tcp://AkkaRemoteServer@127.0.0.1:2552/user/CalculatorActor");

	@Override
	public void onReceive(Object message) throws Exception {
		if (message.equals("DoCalcs")) {

			log.info("Got a calc job, send it to the remote calculator");
			actorRef.tell(new Messages.Sum(1, 2), getSelf());

		} else if (message instanceof Messages.Result) {
			Messages.Result result = (Messages.Result) message;
			log.info("Got result back from calculator: {}", result.getResult());
		}
	}
}