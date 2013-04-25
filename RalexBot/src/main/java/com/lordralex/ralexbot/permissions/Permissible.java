/*
 * Copyright (C) 2013 Laptop
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.lordralex.ralexbot.permissions;

import java.util.Map;

/**
 * @version 1.0
 * @author Laptop
 */
public interface Permissible {

    public boolean hasPermission(Permission perm);

    public void addPermission(Permission perm);

    public void addPermission(Permission perm, boolean val);

    public void removePermission(Permission perm);

    public Map<Permission, Boolean> getPermissions();
}
