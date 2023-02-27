# Use Node.js v12
FROM node:16-alpine

WORKDIR /usr/src/app

# Copy over the whole folder content
COPY . ./

# Make a clean npm install
RUN npm ci --omit=dev

EXPOSE 8080

# Run the web service on container startup.
CMD [ "npm", "run", "start" ]