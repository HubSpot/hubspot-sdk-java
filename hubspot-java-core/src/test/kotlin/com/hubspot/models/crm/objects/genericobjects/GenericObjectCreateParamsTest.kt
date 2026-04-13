// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.genericobjects

import com.hubspot.core.JsonValue
import com.hubspot.models.AssociationSpec
import com.hubspot.models.PublicObjectId
import com.hubspot.models.crm.objects.PublicAssociationsForObject
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GenericObjectCreateParamsTest {

    @Test
    fun create() {
        GenericObjectCreateParams.builder()
            .objectType("objectType")
            .simplePublicObjectInputForCreate(
                SimplePublicObjectInputForCreate.builder()
                    .addAssociation(
                        PublicAssociationsForObject.builder()
                            .to(PublicObjectId.builder().id("id").build())
                            .addType(
                                AssociationSpec.builder()
                                    .associationCategory(
                                        AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .properties(
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GenericObjectCreateParams.builder()
                .objectType("objectType")
                .simplePublicObjectInputForCreate(
                    SimplePublicObjectInputForCreate.builder()
                        .addAssociation(
                            PublicAssociationsForObject.builder()
                                .to(PublicObjectId.builder().id("id").build())
                                .addType(
                                    AssociationSpec.builder()
                                        .associationCategory(
                                            AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                        )
                                        .associationTypeId(0)
                                        .build()
                                )
                                .build()
                        )
                        .properties(
                            SimplePublicObjectInputForCreate.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
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
            GenericObjectCreateParams.builder()
                .objectType("objectType")
                .simplePublicObjectInputForCreate(
                    SimplePublicObjectInputForCreate.builder()
                        .addAssociation(
                            PublicAssociationsForObject.builder()
                                .to(PublicObjectId.builder().id("id").build())
                                .addType(
                                    AssociationSpec.builder()
                                        .associationCategory(
                                            AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                        )
                                        .associationTypeId(0)
                                        .build()
                                )
                                .build()
                        )
                        .properties(
                            SimplePublicObjectInputForCreate.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SimplePublicObjectInputForCreate.builder()
                    .addAssociation(
                        PublicAssociationsForObject.builder()
                            .to(PublicObjectId.builder().id("id").build())
                            .addType(
                                AssociationSpec.builder()
                                    .associationCategory(
                                        AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .properties(
                        SimplePublicObjectInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
