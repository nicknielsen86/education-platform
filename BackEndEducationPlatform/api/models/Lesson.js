/**
 * Lesson.js
 *
 * @description :: TODO: You might write a short summary of how this model works and what it represents here.
 * @docs        :: http://sailsjs.org/#!documentation/models
 */

module.exports = {

  attributes: {
    lesson_id: {
      primaryKey: true,
      type: 'integer'
    },
    enrolled_users: {
      collection: "user",
      via: "enrolled_lessons"
    },
    title: {
      type: "string"
    },
    concepts: {
      collection: "concept",
      via: "lesson"
    }
  }
};

