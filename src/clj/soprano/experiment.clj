(ns soprano.experiment)

(def all-experiments {})

(def experiment-setup
  {:name "My button color experiment"
   :experiment-code "my-experiment"
   :created-by "Madan"
   :created-at "2015-12-01"
   :options {:blue {:button-color "BLUE"}
             :red {:button-color "RED"}
             :green {:button-color "GREEN"}}})

(def experiment-run-configs
  {:experiment-code "my-experiment"
   :start-time "2015-12-03"
   :end-time "2015-12-13"
   :created-by "Lokesh"
   :created-time "2015-12-02"
   :option-configuration {:blue {:probability 0.2}
                          :red {:probability 0.5}
                          :green {:probability 0.3
                                  :default true}}})
