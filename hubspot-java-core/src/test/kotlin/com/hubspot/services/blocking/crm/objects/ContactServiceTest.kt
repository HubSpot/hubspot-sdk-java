// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.AssociationSpec
import com.hubspot.models.PublicObjectId
import com.hubspot.models.crm.Filter
import com.hubspot.models.crm.FilterGroup
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.objects.PublicAssociationsForObject
import com.hubspot.models.crm.objects.PublicMergeInput
import com.hubspot.models.crm.objects.SimplePublicObjectInput
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.models.crm.objects.contacts.ContactGetParams
import com.hubspot.models.crm.objects.contacts.ContactUpdateParams
import com.hubspot.models.crm.objects.contacts.PublicGdprDeleteInput
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val contactService = client.crm().objects().contacts()

        val simplePublicObject =
            contactService.create(
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

        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val contactService = client.crm().objects().contacts()

        val simplePublicObject =
            contactService.update(
                ContactUpdateParams.builder()
                    .contactId("contactId")
                    .idProperty("idProperty")
                    .simplePublicObjectInput(
                        SimplePublicObjectInput.builder()
                            .properties(
                                SimplePublicObjectInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val contactService = client.crm().objects().contacts()

        val page = contactService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val contactService = client.crm().objects().contacts()

        contactService.delete("contactId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun gdprDelete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val contactService = client.crm().objects().contacts()

        contactService.gdprDelete(
            PublicGdprDeleteInput.builder().objectId("objectId").idProperty("idProperty").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val contactService = client.crm().objects().contacts()

        val simplePublicObjectWithAssociations =
            contactService.get(
                ContactGetParams.builder()
                    .contactId("contactId")
                    .archived(true)
                    .addAssociation("string")
                    .idProperty("idProperty")
                    .addProperty("string")
                    .addPropertiesWithHistory("string")
                    .build()
            )

        simplePublicObjectWithAssociations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun merge() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val contactService = client.crm().objects().contacts()

        val simplePublicObject =
            contactService.merge(
                PublicMergeInput.builder()
                    .objectIdToMerge("objectIdToMerge")
                    .primaryObjectId("primaryObjectId")
                    .build()
            )

        simplePublicObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val contactService = client.crm().objects().contacts()

        val collectionResponseWithTotalSimplePublicObject =
            contactService.search(
                PublicObjectSearchRequest.builder()
                    .after("after")
                    .addFilterGroup(
                        FilterGroup.builder()
                            .addFilter(
                                Filter.builder()
                                    .operator(Filter.Operator.BETWEEN)
                                    .propertyName("propertyName")
                                    .highValue("highValue")
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .build()
                    )
                    .limit(0)
                    .addProperty("string")
                    .addSort("string")
                    .query("query")
                    .build()
            )

        collectionResponseWithTotalSimplePublicObject.validate()
    }
}
