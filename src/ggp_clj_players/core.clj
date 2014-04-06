(ns ggp-clj-players.core
  (:require [clojure.java.shell :as shell]))

(defn kiosk []
  (shell/sh "java" "-cp" "target/ggp-clj-players-0.1.1-standalone.jar" "org.ggp.base.apps.kiosk.Kiosk")
  (System/exit 0))

(defn play []
  (println (:out (shell/sh "java" "-cp" "target/ggp-clj-players-0.1.1-standalone.jar" "org.ggp.base.apps.player.PlayerRunner" "9147" "cljRandomPlayer")))
  (System/exit 0))
