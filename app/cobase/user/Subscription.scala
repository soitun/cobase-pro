package cobase.user

/**
 * The user object.
 *
 * @param id Id of the row
 * @param userID The unique ID of the user.
 * @param groupId The id of the group subcribed to.
 */
case class Subscription(
  id: Long,
  userID: String,
  groupId: String
)
