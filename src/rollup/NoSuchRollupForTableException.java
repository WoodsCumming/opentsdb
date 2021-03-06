// This file is part of OpenTSDB.
// Copyright (C) 2010-2015  The OpenTSDB Authors.
//
// This program is free software: you can redistribute it and/or modify it
// under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 2.1 of the License, or (at your
// option) any later version.  This program is distributed in the hope that it
// will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
// of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser
// General Public License for more details.  You should have received a copy
// of the GNU Lesser General Public License along with this program.  If not,
// see <http://www.gnu.org/licenses/>.
package net.opentsdb.rollup;

import java.util.NoSuchElementException;

/**
 * Exception thrown when a rollup couldn't be found in the table name to rollup
 * interval map
 * @since 2.4
 */
public class NoSuchRollupForTableException extends NoSuchElementException {

  /**
   * Ctor that builds the message based on a string table lookup
   * @param table The table name
   */
  public NoSuchRollupForTableException(final String table) {
    super("No rollups configured for the table: " + table);
  }

  private static final long serialVersionUID = 6620255176637863260L;

}
