// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicPermissionSetNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicPermissionSetNoPaging =
            CollectionResponsePublicPermissionSetNoPaging.builder()
                .addResult(
                    PublicPermissionSet.builder()
                        .id("id")
                        .name("name")
                        .requiresBillingWrite(true)
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicPermissionSetNoPaging.results())
            .containsExactly(
                PublicPermissionSet.builder()
                    .id("id")
                    .name("name")
                    .requiresBillingWrite(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicPermissionSetNoPaging =
            CollectionResponsePublicPermissionSetNoPaging.builder()
                .addResult(
                    PublicPermissionSet.builder()
                        .id("id")
                        .name("name")
                        .requiresBillingWrite(true)
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicPermissionSetNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicPermissionSetNoPaging),
                jacksonTypeRef<CollectionResponsePublicPermissionSetNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicPermissionSetNoPaging)
            .isEqualTo(collectionResponsePublicPermissionSetNoPaging)
    }
}
