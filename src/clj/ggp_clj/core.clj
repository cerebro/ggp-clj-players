(ns ggp-clj.core
  (:import (org.ggp.base.player.gamer.statemachine StateMachineGamer)
           (org.ggp.base.util.statemachine.implementation.prover ProverStateMachine))
  (:gen-class)
  )

(defn RandomMoveClojurePlayer []
  (proxy [StateMachineGamer] []
    ;; NOTE: the implicit 'this symbol is bound to the local class.

    (getInitialStateMachine []
      (ProverStateMachine.))

    (stateMachineSelectMove [timeout]
      (let [state-machine (.getStateMachine this)
            current-state (.getCurrentState this)
            role          (.getRole this)
            random-move   (.getRandomMove state-machine
                                          current-state
                                          role)]
        random-move))

    (stateMachineMetaGame [timeout]
      (println "SampleClojureGamer metagame called"))

    (stateMachineAbort []
      (println "SampleClojureGamer abort called"))

    (stateMachineStop []
      (println "SampleClojureGamer stop called"))))
