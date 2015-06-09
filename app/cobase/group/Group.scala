package cobase.group

/**
 * The group object.
 *
 * @param id The unique ID of the group.
 * @param title The title of the group.
 * @param tags Comma seperated list of twitter hashtags.
 */
case class Group (
  id: String,
  title: String,
  tags: String
)
