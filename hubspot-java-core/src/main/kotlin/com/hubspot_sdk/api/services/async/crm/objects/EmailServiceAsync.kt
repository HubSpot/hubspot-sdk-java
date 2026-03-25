// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.emails.EmailCreateParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailDeleteParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailGetParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailListPageAsync
import com.hubspot_sdk.api.models.crm.objects.emails.EmailListParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailSearchParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.emails.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a email with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard emails is provided.
     */
    fun create(params: EmailCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            EmailCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{emailId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{emailId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(emailId: String, params: EmailUpdateParams): CompletableFuture<SimplePublicObject> =
        update(emailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        emailId: String,
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see update */
    fun update(params: EmailUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Retrieve all emails. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<EmailListPageAsync> = list(EmailListParams.none())

    /** @see list */
    fun list(
        params: EmailListParams = EmailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailListPageAsync>

    /** @see list */
    fun list(
        params: EmailListParams = EmailListParams.none()
    ): CompletableFuture<EmailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmailListPageAsync> =
        list(EmailListParams.none(), requestOptions)

    /** Move an Object identified by `{emailId}` to the recycling bin. */
    fun delete(emailId: String): CompletableFuture<Void?> =
        delete(emailId, EmailDeleteParams.none())

    /** @see delete */
    fun delete(
        emailId: String,
        params: EmailDeleteParams = EmailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see delete */
    fun delete(
        emailId: String,
        params: EmailDeleteParams = EmailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(emailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EmailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(emailId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(emailId, EmailDeleteParams.none(), requestOptions)

    /**
     * Retrieve an email identified by `{emailId}`. `{emailId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(emailId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(emailId, EmailGetParams.none())

    /** @see get */
    fun get(
        emailId: String,
        params: EmailGetParams = EmailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see get */
    fun get(
        emailId: String,
        params: EmailGetParams = EmailGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(emailId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EmailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: EmailGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        emailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(emailId, EmailGetParams.none(), requestOptions)

    /**
     * Perform a search for emails based on the provided query parameters and return matching
     * results.
     */
    fun search(
        params: EmailSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: EmailSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            EmailSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [EmailServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/emails`, but is otherwise the
         * same as [EmailServiceAsync.create].
         */
        fun create(
            params: EmailCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                EmailCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/emails/{emailId}`, but is
         * otherwise the same as [EmailServiceAsync.update].
         */
        fun update(
            emailId: String,
            params: EmailUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(emailId, params, RequestOptions.none())

        /** @see update */
        fun update(
            emailId: String,
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see update */
        fun update(
            params: EmailUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/emails`, but is otherwise the
         * same as [EmailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(EmailListParams.none())

        /** @see list */
        fun list(
            params: EmailListParams = EmailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>>

        /** @see list */
        fun list(
            params: EmailListParams = EmailListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(EmailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/emails/{emailId}`, but is
         * otherwise the same as [EmailServiceAsync.delete].
         */
        fun delete(emailId: String): CompletableFuture<HttpResponse> =
            delete(emailId, EmailDeleteParams.none())

        /** @see delete */
        fun delete(
            emailId: String,
            params: EmailDeleteParams = EmailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see delete */
        fun delete(
            emailId: String,
            params: EmailDeleteParams = EmailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(emailId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EmailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(emailId, EmailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/emails/{emailId}`, but is
         * otherwise the same as [EmailServiceAsync.get].
         */
        fun get(
            emailId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(emailId, EmailGetParams.none())

        /** @see get */
        fun get(
            emailId: String,
            params: EmailGetParams = EmailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see get */
        fun get(
            emailId: String,
            params: EmailGetParams = EmailGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(emailId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: EmailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: EmailGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(emailId, EmailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/emails/search`, but is
         * otherwise the same as [EmailServiceAsync.search].
         */
        fun search(
            params: EmailSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: EmailSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                EmailSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
