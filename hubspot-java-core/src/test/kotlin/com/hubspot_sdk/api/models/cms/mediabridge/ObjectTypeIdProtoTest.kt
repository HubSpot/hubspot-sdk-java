// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypeIdProtoTest {

    @Test
    fun create() {
        val objectTypeIdProto = ObjectTypeIdProto.builder().innerId(0).metaTypeId(0).build()

        assertThat(objectTypeIdProto.innerId()).isEqualTo(0)
        assertThat(objectTypeIdProto.metaTypeId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypeIdProto = ObjectTypeIdProto.builder().innerId(0).metaTypeId(0).build()

        val roundtrippedObjectTypeIdProto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypeIdProto),
                jacksonTypeRef<ObjectTypeIdProto>(),
            )

        assertThat(roundtrippedObjectTypeIdProto).isEqualTo(objectTypeIdProto)
    }
}
