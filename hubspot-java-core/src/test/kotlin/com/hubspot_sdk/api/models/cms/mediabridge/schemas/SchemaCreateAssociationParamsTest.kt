// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.schemas

import com.hubspot_sdk.api.models.AssociationDefinitionEgg
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaCreateAssociationParamsTest {

    @Test
    fun create() {
        SchemaCreateAssociationParams.builder()
            .appId(0)
            .objectType("objectType")
            .associationDefinitionEgg(
                AssociationDefinitionEgg.builder()
                    .fromObjectTypeId("fromObjectTypeId")
                    .toObjectTypeId("toObjectTypeId")
                    .name("name")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SchemaCreateAssociationParams.builder()
                .appId(0)
                .objectType("objectType")
                .associationDefinitionEgg(
                    AssociationDefinitionEgg.builder()
                        .fromObjectTypeId("fromObjectTypeId")
                        .toObjectTypeId("toObjectTypeId")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SchemaCreateAssociationParams.builder()
                .appId(0)
                .objectType("objectType")
                .associationDefinitionEgg(
                    AssociationDefinitionEgg.builder()
                        .fromObjectTypeId("fromObjectTypeId")
                        .toObjectTypeId("toObjectTypeId")
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AssociationDefinitionEgg.builder()
                    .fromObjectTypeId("fromObjectTypeId")
                    .toObjectTypeId("toObjectTypeId")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SchemaCreateAssociationParams.builder()
                .appId(0)
                .objectType("objectType")
                .associationDefinitionEgg(
                    AssociationDefinitionEgg.builder()
                        .fromObjectTypeId("fromObjectTypeId")
                        .toObjectTypeId("toObjectTypeId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AssociationDefinitionEgg.builder()
                    .fromObjectTypeId("fromObjectTypeId")
                    .toObjectTypeId("toObjectTypeId")
                    .build()
            )
    }
}
