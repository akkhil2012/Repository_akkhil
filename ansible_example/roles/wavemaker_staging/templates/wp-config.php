<?php
/**
 * The base configurations of the WordPress.
 *
 * This file has the following configurations: MySQL settings, Table Prefix,
 * Secret Keys, WordPress Language, and ABSPATH. You can find more information
 * by visiting {@link http://codex.wordpress.org/Editing_wp-config.php Editing
 * wp-config.php} Codex page. You can get the MySQL settings from your web host.
 *
 * This file is used by the wp-config.php creation script during the
 * installation. You don't have to use the web site, you can just copy this file
 * to "wp-config.php" and fill in the values.
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */


define('DB_NAME', '{{ wp_db_name }}');

/** MySQL database username */
define('DB_USER', '{{ wp_db_user }}');

/** MySQL database password */
define('DB_PASSWORD', '{{ wp_db_password }}');

/** MySQL hostname */
define('DB_HOST', 'localhost');

/** Database Charset to use in creating database tables. */
define('DB_CHARSET', 'utf8');

/** The Database Collate type. Don't change this if in doubt. */
define('DB_COLLATE', '');

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
//define('AUTH_KEY',         '>6-B7U7q5_>,CZr`Mv!.b#9K.fln^p)v-5~^VbBl`WNv-f 5%.n<U,!<1k-7wV22');
//define('SECURE_AUTH_KEY',  'dz3#;P|+W|<gW=!itR!u3g/G=zXJ~v)uk_?[RQP9a;&#cV7l5[l%8>v-k>@U2XiN');
//define('LOGGED_IN_KEY',    'L|CX.EAOCA1WvUQG:_tnOv<Ub@(LZ`T~aVt-|+b-0am@v>7aa-wkVZdQ_uMa0VH+');
//define('NONCE_KEY',        'O1%+L%w{|k1&F8Y_werJYE=<Oi#4^7Xc.vv_QO]dUe5X^+Ho?Fu>s`hODDoN,<Ik');
//define('AUTH_SALT',        '3)Tr>{RUJ8y^2U1&ts#SP09Z$FV[vdV{*f`#KZ(K_noZ*;+Iq6(<+=5t|5Mn+R+L');
//define('SECURE_AUTH_SALT', 'R|ZKK%`5}(T$,+W~W5gUz]ZZQqAVmYif0^6,dO1~g$X#}| |SlPuj|RJp,fviI&q');
//define('LOGGED_IN_SALT',   'LK N$u.3;7btd7//XnT+U]Wh0?|9W fc5UaE^7>SW,(J-fV.]&ZYq/c7xNl.i}No');
//define('NONCE_SALT',       '+U.kaFSp[E5=+VOyP(R]U-0FwfiaN4>|%kPwl|Dtbxb3b/I(L|U]O{`-zu!7r: ]');

define('AUTH_KEY',         '');
define('SECURE_AUTH_KEY',  '');
define('LOGGED_IN_KEY',    '');
define('NONCE_KEY',        '');
define('AUTH_SALT',        '');
define('SECURE_AUTH_SALT', '');
define('LOGGED_IN_SALT',   '');
define('NONCE_SALT',       '');

define('ADMIN_COOKIE_PATH', '/');
define('COOKIE_DOMAIN', '');
define('COOKIEPATH', '');
define('SITECOOKIEPATH', '');



/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each a unique
 * prefix. Only numbers, letters, and underscores please!
 */
$table_prefix  = 'wp_';

/**
 * WordPress Localized Language, defaults to English.
 *
 * Change this to localize WordPress. A corresponding MO file for the chosen
 * language must be installed to wp-content/languages. For example, install
 * de_DE.mo to wp-content/languages and set WPLANG to 'de_DE' to enable German
 * language support.
 */
define('WPLANG', '');

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 */
define('WP_DEBUG', false);

/* That's all, stop editing! Happy blogging. */

/** Absolute path to the WordPress directory. */
if ( !defined('ABSPATH') )
	define('ABSPATH', dirname(__FILE__) . '/');

/** Sets up WordPress vars and included files. */
require_once(ABSPATH . 'wp-settings.php');


//define('WP_HOME','http://172.16.10.183/wmrepo/');
//define('WP_SITEURL','http://172.16.10.183/wmrepo/');
define('WP_HOME','http://{{ inventory_hostname }}/');
define('WP_SITEURL','http://{{ inventory_hostname }}/');

