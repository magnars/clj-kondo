;; GENERATED by script/update-project.clj, DO NOT EDIT
;; To change dependencies, update deps.edn and run script/update-project.clj.
;; To change other things, edit project.template.clj and run script/update-project.clj.

(defproject clj-kondo "2022.08.03"
  :description "A linter for Clojure that sparks joy."
  :url "https://github.com/clj-kondo/clj-kondo"
  :scm {:name "git"
        :url "https://github.com/clj-kondo/clj-kondo"}
  :license {:name "Eclipse Public License 1.0"
            :url "http://opensource.org/licenses/eclipse-1.0.php"}
  :source-paths ["src" "parser" "inlined"]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.cognitect/transit-clj "1.0.324"]
                 [io.lambdaforge/datalog-parser "0.1.9"]
                 [cheshire/cheshire "5.11.0"]
                 [nrepl/bencode "1.1.0"]
                 [org.babashka/sci "0.3.2"]
                 [babashka/fs "0.1.2"]
                 [org.ow2.asm/asm "9.2"]]
  ;; :global-vars {*print-namespace-maps* false}
  :profiles {:clojure-1.9.0 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :clojure-1.10.2 {:dependencies [[org.clojure/clojure "1.10.2"]]}
             :test {:dependencies [[org.clojure/clojurescript "1.11.54"]
                                   [clj-commons/conch "0.9.2"]
                                   [jonase/eastwood "1.2.2"]
                                   [borkdude/missing.test.assertions "0.0.2"]
                                   [babashka/process "0.1.0"]
                                   [org.clojure/tools.deps.alpha "0.12.1048"]]
                    :source-paths ["src" "parser" "inlined" "extract"]}
             :uberjar {:dependencies [[com.github.clj-easy/graal-build-time "0.1.0"]]
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"
                                  "-Dclojure.spec.skip-macros=true"]
                       :main clj-kondo.main
                       :aot [clj-kondo.main]}}
  :aliases {"clj-kondo" ["run" "-m" "clj-kondo.main"]}
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :username :env/clojars_user
                                    :password :env/clojars_pass
                                    :sign-releases false}]])
