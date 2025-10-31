// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.CreatedResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailCreateParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailDeleteParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailGetParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailListPage
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailListParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailSearchParams
import com.hubspot_sdk.api.models.crm.objects.postalmail.PostalMailUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.postalmail.BatchService
import java.util.function.Consumer

interface PostalMailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostalMailService

    fun batch(): BatchService

    /**
     * Create a postal mail with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard postal mail is provided.
     */
    fun create(params: PostalMailCreateParams): CreatedResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostalMailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject =
        create(
            PostalMailCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CreatedResponseSimplePublicObject =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{postalMailId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{postalMailId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(postalMailId: String, params: PostalMailUpdateParams): SimplePublicObject =
        update(postalMailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        postalMailId: String,
        params: PostalMailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see update */
    fun update(params: PostalMailUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostalMailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of postal mail. Control what is returned via the `properties` query param. */
    fun list(): PostalMailListPage = list(PostalMailListParams.none())

    /** @see list */
    fun list(
        params: PostalMailListParams = PostalMailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostalMailListPage

    /** @see list */
    fun list(params: PostalMailListParams = PostalMailListParams.none()): PostalMailListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PostalMailListPage =
        list(PostalMailListParams.none(), requestOptions)

    /** Move an Object identified by `{postalMailId}` to the recycling bin. */
    fun delete(postalMailId: String) = delete(postalMailId, PostalMailDeleteParams.none())

    /** @see delete */
    fun delete(
        postalMailId: String,
        params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see delete */
    fun delete(
        postalMailId: String,
        params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
    ) = delete(postalMailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PostalMailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: PostalMailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(postalMailId: String, requestOptions: RequestOptions) =
        delete(postalMailId, PostalMailDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{postalMailId}`. `{postalMailId}` refers to the internal object
     * ID by default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(postalMailId: String): SimplePublicObjectWithAssociations =
        get(postalMailId, PostalMailGetParams.none())

    /** @see get */
    fun get(
        postalMailId: String,
        params: PostalMailGetParams = PostalMailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

    /** @see get */
    fun get(
        postalMailId: String,
        params: PostalMailGetParams = PostalMailGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(postalMailId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PostalMailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: PostalMailGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        postalMailId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(postalMailId, PostalMailGetParams.none(), requestOptions)

    fun search(params: PostalMailSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: PostalMailSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            PostalMailSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [PostalMailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostalMailService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/postal_mail`, but is otherwise the
         * same as [PostalMailService.create].
         */
        @MustBeClosed
        fun create(
            params: PostalMailCreateParams
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PostalMailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(
                PostalMailCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/postal_mail/{postalMailId}`, but
         * is otherwise the same as [PostalMailService.update].
         */
        @MustBeClosed
        fun update(
            postalMailId: String,
            params: PostalMailUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(postalMailId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            postalMailId: String,
            params: PostalMailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PostalMailUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PostalMailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/postal_mail`, but is otherwise the
         * same as [PostalMailService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PostalMailListPage> = list(PostalMailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PostalMailListParams = PostalMailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostalMailListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PostalMailListParams = PostalMailListParams.none()
        ): HttpResponseFor<PostalMailListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PostalMailListPage> =
            list(PostalMailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/postal_mail/{postalMailId}`, but
         * is otherwise the same as [PostalMailService.delete].
         */
        @MustBeClosed
        fun delete(postalMailId: String): HttpResponse =
            delete(postalMailId, PostalMailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            postalMailId: String,
            params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            postalMailId: String,
            params: PostalMailDeleteParams = PostalMailDeleteParams.none(),
        ): HttpResponse = delete(postalMailId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PostalMailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PostalMailDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(postalMailId: String, requestOptions: RequestOptions): HttpResponse =
            delete(postalMailId, PostalMailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/postal_mail/{postalMailId}`, but is
         * otherwise the same as [PostalMailService.get].
         */
        @MustBeClosed
        fun get(postalMailId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(postalMailId, PostalMailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            postalMailId: String,
            params: PostalMailGetParams = PostalMailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().postalMailId(postalMailId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            postalMailId: String,
            params: PostalMailGetParams = PostalMailGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(postalMailId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PostalMailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: PostalMailGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            postalMailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(postalMailId, PostalMailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/postal_mail/search`, but is
         * otherwise the same as [PostalMailService.search].
         */
        @MustBeClosed
        fun search(
            params: PostalMailSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: PostalMailSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                PostalMailSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
