// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicGdprDeleteInputTest {

    @Test
    fun create() {
        val publicGdprDeleteInput =
            PublicGdprDeleteInput.builder().objectId("objectId").idProperty("idProperty").build()

        assertThat(publicGdprDeleteInput.objectId()).isEqualTo("objectId")
        assertThat(publicGdprDeleteInput.idProperty()).contains("idProperty")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicGdprDeleteInput =
            PublicGdprDeleteInput.builder().objectId("objectId").idProperty("idProperty").build()

        val roundtrippedPublicGdprDeleteInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicGdprDeleteInput),
                jacksonTypeRef<PublicGdprDeleteInput>(),
            )

        assertThat(roundtrippedPublicGdprDeleteInput).isEqualTo(publicGdprDeleteInput)
    }
}
