// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionOverrideRequestTest {

    @Test
    fun create() {
        val actionOverrideRequest =
            ActionOverrideRequest.builder()
                .addAssociatedObjectTypeId("string")
                .addListId(0L)
                .addObjectId(0L)
                .addProperty("string")
                .build()

        assertThat(actionOverrideRequest.associatedObjectTypeIds().getOrNull())
            .containsExactly("string")
        assertThat(actionOverrideRequest.listIds().getOrNull()).containsExactly(0L)
        assertThat(actionOverrideRequest.objectIds().getOrNull()).containsExactly(0L)
        assertThat(actionOverrideRequest.properties().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionOverrideRequest =
            ActionOverrideRequest.builder()
                .addAssociatedObjectTypeId("string")
                .addListId(0L)
                .addObjectId(0L)
                .addProperty("string")
                .build()

        val roundtrippedActionOverrideRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionOverrideRequest),
                jacksonTypeRef<ActionOverrideRequest>(),
            )

        assertThat(roundtrippedActionOverrideRequest).isEqualTo(actionOverrideRequest)
    }
}
