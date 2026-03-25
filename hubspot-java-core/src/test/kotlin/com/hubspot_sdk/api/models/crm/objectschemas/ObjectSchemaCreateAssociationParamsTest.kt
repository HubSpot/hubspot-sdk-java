// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objectschemas

import com.hubspot_sdk.api.models.AssociationDefinitionEgg
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSchemaCreateAssociationParamsTest {

    @Test
    fun create() {
        ObjectSchemaCreateAssociationParams.builder()
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
            ObjectSchemaCreateAssociationParams.builder()
                .objectType("objectType")
                .associationDefinitionEgg(
                    AssociationDefinitionEgg.builder()
                        .fromObjectTypeId("fromObjectTypeId")
                        .toObjectTypeId("toObjectTypeId")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ObjectSchemaCreateAssociationParams.builder()
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
            ObjectSchemaCreateAssociationParams.builder()
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
