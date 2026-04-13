// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objectlibrary.enablement

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypeEnablementPublicResponseTest {

    @Test
    fun create() {
        val objectTypeEnablementPublicResponse =
            ObjectTypeEnablementPublicResponse.builder().enablement(true).build()

        assertThat(objectTypeEnablementPublicResponse.enablement()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypeEnablementPublicResponse =
            ObjectTypeEnablementPublicResponse.builder().enablement(true).build()

        val roundtrippedObjectTypeEnablementPublicResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypeEnablementPublicResponse),
                jacksonTypeRef<ObjectTypeEnablementPublicResponse>(),
            )

        assertThat(roundtrippedObjectTypeEnablementPublicResponse)
            .isEqualTo(objectTypeEnablementPublicResponse)
    }
}
