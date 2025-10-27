// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiAssociationTimestampDataSourceTest {

    @Test
    fun create() {
        val apiAssociationTimestampDataSource =
            ApiAssociationTimestampDataSource.builder()
                .associationCategory(
                    ApiAssociationTimestampDataSource.AssociationCategory.HUBSPOT_DEFINED
                )
                .associationTypeId(0)
                .name("name")
                .objectTypeId("objectTypeId")
                .type(ApiAssociationTimestampDataSource.Type.ASSOCIATION_TIMESTAMP)
                .build()

        assertThat(apiAssociationTimestampDataSource.associationCategory())
            .isEqualTo(ApiAssociationTimestampDataSource.AssociationCategory.HUBSPOT_DEFINED)
        assertThat(apiAssociationTimestampDataSource.associationTypeId()).isEqualTo(0)
        assertThat(apiAssociationTimestampDataSource.name()).isEqualTo("name")
        assertThat(apiAssociationTimestampDataSource.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(apiAssociationTimestampDataSource.type())
            .isEqualTo(ApiAssociationTimestampDataSource.Type.ASSOCIATION_TIMESTAMP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiAssociationTimestampDataSource =
            ApiAssociationTimestampDataSource.builder()
                .associationCategory(
                    ApiAssociationTimestampDataSource.AssociationCategory.HUBSPOT_DEFINED
                )
                .associationTypeId(0)
                .name("name")
                .objectTypeId("objectTypeId")
                .type(ApiAssociationTimestampDataSource.Type.ASSOCIATION_TIMESTAMP)
                .build()

        val roundtrippedApiAssociationTimestampDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiAssociationTimestampDataSource),
                jacksonTypeRef<ApiAssociationTimestampDataSource>(),
            )

        assertThat(roundtrippedApiAssociationTimestampDataSource)
            .isEqualTo(apiAssociationTimestampDataSource)
    }
}
