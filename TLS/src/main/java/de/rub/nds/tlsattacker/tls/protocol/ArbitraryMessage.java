/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.tls.protocol;

import de.rub.nds.tlsattacker.tls.workflow.TlsContext;

/**
 * An arbitrary protocol message
 * 
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
public class ArbitraryMessage extends ProtocolMessage {
    
    public ArbitraryMessage() {
        this.setRequired(false);
    }

    @Override
    public ProtocolMessageHandler getProtocolMessageHandler(TlsContext tlsContext) {
        throw new UnsupportedOperationException("Arbitrary message protocol handler not supported yet."); 
    }

    @Override
    public String toCompactString() {
        return "Arbitrary Protocol Message";
    }
    
}
