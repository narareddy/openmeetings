/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.web.room.wb;

import org.apache.openmeetings.core.util.WbAction;
import org.apache.openmeetings.util.ws.IClusterWsMessage;

import com.github.openjson.JSONObject;

public class WsMessageWb implements IClusterWsMessage {
	private static final long serialVersionUID = 1L;
	private final Long roomId;
	private final WbAction meth;
	private final String obj;
	private final String uid;

	public WsMessageWb(Long roomId, WbAction meth, JSONObject obj, String uid) {
		this.roomId = roomId;
		this.meth = meth;
		this.obj = obj.toString();
		this.uid = uid;
	}

	public Long getRoomId() {
		return roomId;
	}

	public WbAction getMeth() {
		return meth;
	}

	public JSONObject getObj() {
		return new JSONObject(obj);
	}

	public String getUid() {
		return uid;
	}
}
