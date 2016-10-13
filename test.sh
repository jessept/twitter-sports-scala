${SPARK_HOME}/bin/spark-submit \
     --class "com.apps.sports_classifier.CollectTweets" \
     --master ${YOUR_SPARK_MASTER:-local[4]} \
     --packages org.apache.bahir:spark-streaming-twitter_2.11:2.0.0 \
     target/scala-2.11/twitter-sports-scala_2.11-1.0.jar \
     ${YOUR_OUTPUT_DIR:-/tmp/tweets} \
     ${NUM_TWEETS_TO_COLLECT:-10000} \
     ${OUTPUT_FILE_INTERVAL_IN_SECS:-10} \
     ${OUTPUT_FILE_PARTITIONS_EACH_INTERVAL:-1} \
     --consumerKey tqjwZRUmQVLdLk9K8NwvOAbzc \
     --consumerSecret epjC4yRqRajIPPCjnUySNnugDx9upgUAJ4fRBgtJ4xB53WDbbb \
     --accessToken 945119833-lbZNTleSchS9kTe1sMDtXf3cp4pUS84Ogw3URMHb  \
     --accessTokenSecret lclPq8aTWsK3vleAEI4KAa8pmeTbcLjm25fa0yo3vyPNc
