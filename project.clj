(defproject ggp-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [junit/junit "4.11"]
                 [org.json/json "20140107"]
                 [org.apache.xmlgraphics/batik-transcoder "1.7"]
                 [org.python/jython "2.7-b1"]
                 [org.xhtmlrenderer/flying-saucer-core "9.0.4"]
                 [nu.validator.htmlparser/htmlparser "1.4"]
                 [com.google.guava/guava "16.0"]
                 [org.reflections/reflections "0.9.9-RC1"]] ;; [org.ggp/ggp-base "0.1.0"]

  :aot :all
  ; :profiles {:uberjar {:aot :all}}
  ; :main [ggp-clj.main]
  :java-source-paths ["src/java"]
  :source-paths      ["src/clj"]
  :javac-options     ["-target" "1.7" "-source" "1.7"] ; "-Xlint:deprecation"
  ; :global-vars {*warn-on-reflection* true
  ;               *assert* false}
  ; :bootclasspath true

  )
