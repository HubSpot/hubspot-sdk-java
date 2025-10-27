// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiAssociationDataSourceTest {

    @Test
    fun create() {
        val apiAssociationDataSource =
            ApiAssociationDataSource.builder()
                .associationCategory(ApiAssociationDataSource.AssociationCategory.HUBSPOT_DEFINED)
                .associationTypeId(0)
                .name("name")
                .objectTypeId("objectTypeId")
                .type(ApiAssociationDataSource.Type.ASSOCIATION)
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        assertThat(apiAssociationDataSource.associationCategory())
            .isEqualTo(ApiAssociationDataSource.AssociationCategory.HUBSPOT_DEFINED)
        assertThat(apiAssociationDataSource.associationTypeId()).isEqualTo(0)
        assertThat(apiAssociationDataSource.name()).isEqualTo("name")
        assertThat(apiAssociationDataSource.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(apiAssociationDataSource.type())
            .isEqualTo(ApiAssociationDataSource.Type.ASSOCIATION)
        assertThat(apiAssociationDataSource.sortBy())
            .contains(
                ApiSort.builder()
                    .order(ApiSort.Order.ASC)
                    .property("property")
                    .missing("missing")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiAssociationDataSource =
            ApiAssociationDataSource.builder()
                .associationCategory(ApiAssociationDataSource.AssociationCategory.HUBSPOT_DEFINED)
                .associationTypeId(0)
                .name("name")
                .objectTypeId("objectTypeId")
                .type(ApiAssociationDataSource.Type.ASSOCIATION)
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        val roundtrippedApiAssociationDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiAssociationDataSource),
                jacksonTypeRef<ApiAssociationDataSource>(),
            )

        assertThat(roundtrippedApiAssociationDataSource).isEqualTo(apiAssociationDataSource)
    }
}
