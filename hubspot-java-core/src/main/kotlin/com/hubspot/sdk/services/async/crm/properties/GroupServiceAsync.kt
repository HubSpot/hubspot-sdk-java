// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.properties

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.CollectionResponsePropertyGroupNoPaging
import com.hubspot.sdk.models.PropertyGroup
import com.hubspot.sdk.models.crm.properties.groups.GroupCreateParams
import com.hubspot.sdk.models.crm.properties.groups.GroupDeleteParams
import com.hubspot.sdk.models.crm.properties.groups.GroupGetParams
import com.hubspot.sdk.models.crm.properties.groups.GroupListParams
import com.hubspot.sdk.models.crm.properties.groups.GroupUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync

    /** Create and return a copy of a new property group. */
    fun create(objectType: String, params: GroupCreateParams): CompletableFuture<PropertyGroup> =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: GroupCreateParams): CompletableFuture<PropertyGroup> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup>

    /**
     * Perform a partial update of a property group identified by {groupName}. Provided fields will
     * be overwritten.
     */
    fun update(groupName: String, params: GroupUpdateParams): CompletableFuture<PropertyGroup> =
        update(groupName, params, RequestOptions.none())

    /** @see update */
    fun update(
        groupName: String,
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup> =
        update(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see update */
    fun update(params: GroupUpdateParams): CompletableFuture<PropertyGroup> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup>

    /** Read all existing property groups for the specified object type and HubSpot account. */
    fun list(objectType: String): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        list(objectType, GroupListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: GroupListParams = GroupListParams.none(),
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging>

    /** @see list */
    fun list(params: GroupListParams): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        list(objectType, GroupListParams.none(), requestOptions)

    /** Move a property group identified by {groupName} to the recycling bin. */
    fun delete(groupName: String, params: GroupDeleteParams): CompletableFuture<Void?> =
        delete(groupName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        groupName: String,
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see delete */
    fun delete(params: GroupDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Read a property group identified by {groupName}. */
    fun get(groupName: String, params: GroupGetParams): CompletableFuture<PropertyGroup> =
        get(groupName, params, RequestOptions.none())

    /** @see get */
    fun get(
        groupName: String,
        params: GroupGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup> =
        get(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see get */
    fun get(params: GroupGetParams): CompletableFuture<PropertyGroup> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: GroupGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup>

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/properties/2026-03/{objectType}/groups`, but
         * is otherwise the same as [GroupServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: GroupCreateParams,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(params: GroupCreateParams): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/properties/2026-03/{objectType}/groups/{groupName}`, but is otherwise the same as
         * [GroupServiceAsync.update].
         */
        fun update(
            groupName: String,
            params: GroupUpdateParams,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            update(groupName, params, RequestOptions.none())

        /** @see update */
        fun update(
            groupName: String,
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            update(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see update */
        fun update(params: GroupUpdateParams): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>>

        /**
         * Returns a raw HTTP response for `get /crm/properties/2026-03/{objectType}/groups`, but is
         * otherwise the same as [GroupServiceAsync.list].
         */
        fun list(
            objectType: String
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            list(objectType, GroupListParams.none())

        /** @see list */
        fun list(
            objectType: String,
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        fun list(
            objectType: String,
            params: GroupListParams = GroupListParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>>

        /** @see list */
        fun list(
            params: GroupListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            list(objectType, GroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/properties/2026-03/{objectType}/groups/{groupName}`, but is otherwise the same as
         * [GroupServiceAsync.delete].
         */
        fun delete(groupName: String, params: GroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(groupName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            groupName: String,
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see delete */
        fun delete(params: GroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/properties/2026-03/{objectType}/groups/{groupName}`, but is otherwise the same as
         * [GroupServiceAsync.get].
         */
        fun get(
            groupName: String,
            params: GroupGetParams,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            get(groupName, params, RequestOptions.none())

        /** @see get */
        fun get(
            groupName: String,
            params: GroupGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            get(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see get */
        fun get(params: GroupGetParams): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: GroupGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>>
    }
}
