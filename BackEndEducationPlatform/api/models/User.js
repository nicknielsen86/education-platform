/**
 * User.js
 *
 * @description :: TODO: You might write a short summary of how this model works and what it represents here.
 * @docs        :: http://sailsjs.org/#!documentation/models
 */

module.exports = {

  attributes: {
    user_id: {
      primaryKey: true,
      type: "integer"
    },
    first_name: {
      type: "string"
    },
    last_name: {
      type: "string"
    },
    email: {
      type: "string",
      required: true,
      unique: true
    },
    username: {
      type: "string",
      required: true,
      unique: true
    },
    password: {
      type: "string"
    },
    salt: {
      type: "string"
    },
    enrolled_lessons: {
      collection: 'lesson',
      via: 'enrolled_users'
    }
  }
};

