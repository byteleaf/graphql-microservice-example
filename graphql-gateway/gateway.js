const {ApolloServer} = require("apollo-server");
const {ApolloGateway} = require("@apollo/gateway");

const gateway = new ApolloGateway({
  serviceList: [
    {name: "products", url: "http://localhost:8081/graphql"},
    {name: "accounts", url: "http://localhost:8082/graphql"},
    {name: "orders", url: "http://localhost:8083/graphql"}
  ],

  // Experimental: Enabling this enables the query plan view in Playground.
  __exposeQueryPlanExperimental: false,
  // poll interval is not for prod.
  experimental_pollInterval: 5000,
});

(async () => {
  const server = new ApolloServer({
      gateway,
      // Subscriptions are unsupported but planned for a future Gateway version.
      subscriptions: false,
    })
  ;

  server.listen().then(({url}) => {
    console.log(`🚀 Server ready at ${url}`);
  });
})();
