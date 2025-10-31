// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.mediabridge.CollectionResponsePropertyGroupNoPaging
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupDeleteByNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupGetByNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupListParams
import com.hubspot_sdk.api.models.cms.mediabridge.groups.GroupUpdateByNameParams
import com.hubspot_sdk.api.models.crm.properties.PropertyGroup
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

    /** Create a new property group for the specified object type. */
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

    /** Get the property groups for a specified object type. */
    fun list(
        objectType: String,
        params: GroupListParams,
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(params: GroupListParams): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging>

    /** Delete an existing property group by name */
    fun deleteByName(groupName: String, params: GroupDeleteByNameParams): CompletableFuture<Void?> =
        deleteByName(groupName, params, RequestOptions.none())

    /** @see deleteByName */
    fun deleteByName(
        groupName: String,
        params: GroupDeleteByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteByName(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see deleteByName */
    fun deleteByName(params: GroupDeleteByNameParams): CompletableFuture<Void?> =
        deleteByName(params, RequestOptions.none())

    /** @see deleteByName */
    fun deleteByName(
        params: GroupDeleteByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get the details of an existing property group by name. */
    fun getByName(
        groupName: String,
        params: GroupGetByNameParams,
    ): CompletableFuture<PropertyGroup> = getByName(groupName, params, RequestOptions.none())

    /** @see getByName */
    fun getByName(
        groupName: String,
        params: GroupGetByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup> =
        getByName(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see getByName */
    fun getByName(params: GroupGetByNameParams): CompletableFuture<PropertyGroup> =
        getByName(params, RequestOptions.none())

    /** @see getByName */
    fun getByName(
        params: GroupGetByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup>

    /** Update an existing property group by name. */
    fun updateByName(
        groupName: String,
        params: GroupUpdateByNameParams,
    ): CompletableFuture<PropertyGroup> = updateByName(groupName, params, RequestOptions.none())

    /** @see updateByName */
    fun updateByName(
        groupName: String,
        params: GroupUpdateByNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PropertyGroup> =
        updateByName(params.toBuilder().groupName(groupName).build(), requestOptions)

    /** @see updateByName */
    fun updateByName(params: GroupUpdateByNameParams): CompletableFuture<PropertyGroup> =
        updateByName(params, RequestOptions.none())

    /** @see updateByName */
    fun updateByName(
        params: GroupUpdateByNameParams,
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
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/properties/{objectType}/groups`, but is otherwise the same as
         * [GroupServiceAsync.create].
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
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/properties/{objectType}/groups`, but is otherwise the same as
         * [GroupServiceAsync.list].
         */
        fun list(
            objectType: String,
            params: GroupListParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            objectType: String,
            params: GroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        fun list(
            params: GroupListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/v1/{appId}/properties/{objectType}/groups/{groupName}`, but is otherwise
         * the same as [GroupServiceAsync.deleteByName].
         */
        fun deleteByName(
            groupName: String,
            params: GroupDeleteByNameParams,
        ): CompletableFuture<HttpResponse> = deleteByName(groupName, params, RequestOptions.none())

        /** @see deleteByName */
        fun deleteByName(
            groupName: String,
            params: GroupDeleteByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteByName(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see deleteByName */
        fun deleteByName(params: GroupDeleteByNameParams): CompletableFuture<HttpResponse> =
            deleteByName(params, RequestOptions.none())

        /** @see deleteByName */
        fun deleteByName(
            params: GroupDeleteByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/properties/{objectType}/groups/{groupName}`, but is otherwise
         * the same as [GroupServiceAsync.getByName].
         */
        fun getByName(
            groupName: String,
            params: GroupGetByNameParams,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            getByName(groupName, params, RequestOptions.none())

        /** @see getByName */
        fun getByName(
            groupName: String,
            params: GroupGetByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            getByName(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see getByName */
        fun getByName(
            params: GroupGetByNameParams
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            getByName(params, RequestOptions.none())

        /** @see getByName */
        fun getByName(
            params: GroupGetByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/properties/{objectType}/groups/{groupName}`, but is otherwise
         * the same as [GroupServiceAsync.updateByName].
         */
        fun updateByName(
            groupName: String,
            params: GroupUpdateByNameParams,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            updateByName(groupName, params, RequestOptions.none())

        /** @see updateByName */
        fun updateByName(
            groupName: String,
            params: GroupUpdateByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            updateByName(params.toBuilder().groupName(groupName).build(), requestOptions)

        /** @see updateByName */
        fun updateByName(
            params: GroupUpdateByNameParams
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> =
            updateByName(params, RequestOptions.none())

        /** @see updateByName */
        fun updateByName(
            params: GroupUpdateByNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PropertyGroup>>
    }
}
