(ns ggp-clj-players.random
  (:import (org.ggp.base.player.gamer.statemachine StateMachineGamer)
           (org.ggp.base.util.statemachine.implementation.prover ProverStateMachine))
  (:gen-class
      :extends org.ggp.base.player.gamer.statemachine.StateMachineGamer
      :name org.ggp.base.player.gamer.clojure.cljRandomPlayer))

(def player-name (str "cljRandomPlayer"))

(defn -getName [this]
  player-name)

(defn -getInitialStateMachine [this]
  (ProverStateMachine.))

(defn -stateMachineSelectMove [this timeout]
  (let [state-machine (.getStateMachine this)
        current-state (.getCurrentState this)
        role          (.getRole this)
        random-move   (.getRandomMove state-machine
                                      current-state
                                      role)]
   random-move))

(defn -stateMachineMetaGame [this timeout]
  (println (str player-name" metagame called")))

(defn -stateMachineAbort [this]
  (println (str player-name" abort called")))

(defn -stateMachineStop [this]
  (println (str player-name" stop called")))
