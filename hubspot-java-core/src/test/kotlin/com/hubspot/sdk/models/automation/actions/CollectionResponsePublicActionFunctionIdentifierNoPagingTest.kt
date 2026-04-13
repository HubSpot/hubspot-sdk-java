// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicActionFunctionIdentifierNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicActionFunctionIdentifierNoPaging =
            CollectionResponsePublicActionFunctionIdentifierNoPaging.builder()
                .addResult(
                    PublicActionFunctionIdentifier.builder()
                        .functionType(
                            PublicActionFunctionIdentifier.FunctionType.POST_ACTION_EXECUTION
                        )
                        .id("id")
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicActionFunctionIdentifierNoPaging.results())
            .containsExactly(
                PublicActionFunctionIdentifier.builder()
                    .functionType(PublicActionFunctionIdentifier.FunctionType.POST_ACTION_EXECUTION)
                    .id("id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicActionFunctionIdentifierNoPaging =
            CollectionResponsePublicActionFunctionIdentifierNoPaging.builder()
                .addResult(
                    PublicActionFunctionIdentifier.builder()
                        .functionType(
                            PublicActionFunctionIdentifier.FunctionType.POST_ACTION_EXECUTION
                        )
                        .id("id")
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicActionFunctionIdentifierNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponsePublicActionFunctionIdentifierNoPaging
                ),
                jacksonTypeRef<CollectionResponsePublicActionFunctionIdentifierNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicActionFunctionIdentifierNoPaging)
            .isEqualTo(collectionResponsePublicActionFunctionIdentifierNoPaging)
    }
}
