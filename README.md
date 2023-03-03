# hackathon
An awesome project demonstrating testNG integration with Browserstack automate, Browserstack AppAutomate, Percy, AppPercy and Browserstack Observabiltiy. 

## Web testing
To run the test suite proceed as follow: 
### setup
First, you'll need to create a [Percy project](https://percy.io/) and retrieve your Percy token. 
You'll also need your [Browserstack credentials](https://www.browserstack.com/accounts/profile). 

```bash
cd web
npm install @percy/cli
export BROWSERSTACK_USERNAME=<your_username>
export BROWSERSTACK_ACCESSKEY=<your_accesskey>
export PERCY_TOKEN=<your_percy_project_token>
```
### execute
```bash
mvn test -P bstack-parallel
```

## Native App Testing
To run the test suite proceed as follow: 
### setup
First, you'll need to create an [App Percy project](https://percy.io/) and retrieve your Percy token. 
You'll also need your [Browserstack credentials](https://www.browserstack.com/accounts/profile). 

```bash
cd web
npm install @percy/cli
export BROWSERSTACK_USERNAME=<your_username>
export BROWSERSTACK_ACCESSKEY=<your_accesskey>
export PERCY_TOKEN=<your_percy_project_token>
```
### execute
```bash
mvn test -P bstack-parallel
```
