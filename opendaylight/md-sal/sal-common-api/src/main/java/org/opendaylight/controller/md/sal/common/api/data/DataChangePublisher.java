/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.sal.common.api.data;

import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.concepts.Path;

/**
 *
 * @deprecated Replaced by {@link AsyncDataBroker}
 */
@Deprecated
public interface DataChangePublisher<P extends Path<P>, D, L extends DataChangeListener<P,D>> {

    ListenerRegistration<L> registerDataChangeListener(P path, L listener);

}
