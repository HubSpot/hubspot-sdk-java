// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.lists

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.lists.MembershipChangeRequest
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddAllFromListParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddAndRemoveParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetListsParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MembershipServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipService = client.crm().lists().memberships()

        val page = membershipService.list("listId")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipService = client.crm().lists().memberships()

        val membershipsUpdateResponse =
            membershipService.add(
                MembershipAddParams.builder().listId("listId").addBody("string").build()
            )

        membershipsUpdateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addAllFromList() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipService = client.crm().lists().memberships()

        membershipService.addAllFromList(
            MembershipAddAllFromListParams.builder()
                .listId("listId")
                .sourceListId("sourceListId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addAndRemove() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipService = client.crm().lists().memberships()

        val membershipsUpdateResponse =
            membershipService.addAndRemove(
                MembershipAddAndRemoveParams.builder()
                    .listId("listId")
                    .membershipChangeRequest(
                        MembershipChangeRequest.builder()
                            .recordIdsToAdd(listOf("123", "456", "789"))
                            .addRecordIdsToRemove("654")
                            .build()
                    )
                    .build()
            )

        membershipsUpdateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getLists() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipService = client.crm().lists().memberships()

        val apiCollectionResponseRecordListMembershipNoPaging =
            membershipService.getLists(
                MembershipGetListsParams.builder()
                    .objectTypeId("objectTypeId")
                    .recordId("recordId")
                    .build()
            )

        apiCollectionResponseRecordListMembershipNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getPageOrderedByAddedToListDate() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipService = client.crm().lists().memberships()

        val page = membershipService.getPageOrderedByAddedToListDate("listId")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipService = client.crm().lists().memberships()

        val membershipsUpdateResponse =
            membershipService.remove(
                MembershipRemoveParams.builder().listId("listId").addBody("string").build()
            )

        membershipsUpdateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeAll() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val membershipService = client.crm().lists().memberships()

        membershipService.removeAll("listId")
    }
}
