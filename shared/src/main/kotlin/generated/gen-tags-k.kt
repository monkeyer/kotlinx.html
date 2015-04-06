package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class KBD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("kbd", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class KEYGEN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("keygen", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var challenge : String by attributeStringf30f39f0
    var autoFocus : Boolean by attributeBooleanAutoFocusAutoFocusEmptya5698437
    var keyType : KeyType by attributeKeyTypeKeyTypeKeyTypeValues8030c68a
    var disabled : Boolean by attributeBooleanDisabledDisabledEmptyf8f91d7
    var form : String by attributeStringf30f39f0
    var name : String by attributeStringf30f39f0

}
