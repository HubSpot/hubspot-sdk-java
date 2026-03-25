// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objectschemas

import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import com.hubspot_sdk.api.models.ObjectTypeDefinitionPatch
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSchemaUpdateParamsTest {

    @Test
    fun create() {
        ObjectSchemaUpdateParams.builder()
            .objectType("objectType")
            .objectTypeDefinitionPatch(
                ObjectTypeDefinitionPatch.builder()
                    .clearDescription(true)
                    .allowsSensitiveProperties(true)
                    .description("description")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .primaryDisplayProperty("primaryDisplayProperty")
                    .addRequiredProperty("string")
                    .restorable(true)
                    .addSearchableProperty("string")
                    .addSecondaryDisplayProperty("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ObjectSchemaUpdateParams.builder()
                .objectType("objectType")
                .objectTypeDefinitionPatch(
                    ObjectTypeDefinitionPatch.builder().clearDescription(true).build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ObjectSchemaUpdateParams.builder()
                .objectType("objectType")
                .objectTypeDefinitionPatch(
                    ObjectTypeDefinitionPatch.builder()
                        .clearDescription(true)
                        .allowsSensitiveProperties(true)
                        .description("description")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .primaryDisplayProperty("primaryDisplayProperty")
                        .addRequiredProperty("string")
                        .restorable(true)
                        .addSearchableProperty("string")
                        .addSecondaryDisplayProperty("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ObjectTypeDefinitionPatch.builder()
                    .clearDescription(true)
                    .allowsSensitiveProperties(true)
                    .description("description")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .primaryDisplayProperty("primaryDisplayProperty")
                    .addRequiredProperty("string")
                    .restorable(true)
                    .addSearchableProperty("string")
                    .addSecondaryDisplayProperty("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ObjectSchemaUpdateParams.builder()
                .objectType("objectType")
                .objectTypeDefinitionPatch(
                    ObjectTypeDefinitionPatch.builder().clearDescription(true).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(ObjectTypeDefinitionPatch.builder().clearDescription(true).build())
    }
}
