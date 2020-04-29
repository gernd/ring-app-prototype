(ns my-ring-app.core
  (:use ring.adapter.jetty)
  (:gen-class))


(defn my-handler
  [request]
  {
   :status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello from the Ring Application aka Wiesn Prototype"
   }
  )

(defn -main
  "Fires up the Ring app"
  [& args]
  (run-jetty my-handler {:port 8080})

  )
