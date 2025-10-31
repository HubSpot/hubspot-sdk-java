// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.ObjectService
import com.hubspot_sdk.api.services.blocking.crm.ObjectServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.CallService
import com.hubspot_sdk.api.services.blocking.crm.objects.CallServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.CartService
import com.hubspot_sdk.api.services.blocking.crm.objects.CartServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.CommercePaymentService
import com.hubspot_sdk.api.services.blocking.crm.objects.CommercePaymentServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.CommunicationService
import com.hubspot_sdk.api.services.blocking.crm.objects.CommunicationServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.CompanyService
import com.hubspot_sdk.api.services.blocking.crm.objects.CompanyServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.ContactService
import com.hubspot_sdk.api.services.blocking.crm.objects.ContactServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.ContractService
import com.hubspot_sdk.api.services.blocking.crm.objects.ContractServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.CourseService
import com.hubspot_sdk.api.services.blocking.crm.objects.CourseServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.CustomService
import com.hubspot_sdk.api.services.blocking.crm.objects.CustomServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.DealService
import com.hubspot_sdk.api.services.blocking.crm.objects.DealServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.DealSplitService
import com.hubspot_sdk.api.services.blocking.crm.objects.DealSplitServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.DiscountService
import com.hubspot_sdk.api.services.blocking.crm.objects.DiscountServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.EmailService
import com.hubspot_sdk.api.services.blocking.crm.objects.EmailServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.FeeService
import com.hubspot_sdk.api.services.blocking.crm.objects.FeeServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.FeedbackSubmissionService
import com.hubspot_sdk.api.services.blocking.crm.objects.FeedbackSubmissionServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.GoalTargetService
import com.hubspot_sdk.api.services.blocking.crm.objects.GoalTargetServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.InvoiceService
import com.hubspot_sdk.api.services.blocking.crm.objects.InvoiceServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.LeadService
import com.hubspot_sdk.api.services.blocking.crm.objects.LeadServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.LineItemService
import com.hubspot_sdk.api.services.blocking.crm.objects.LineItemServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.ListingService
import com.hubspot_sdk.api.services.blocking.crm.objects.ListingServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.MeetingService
import com.hubspot_sdk.api.services.blocking.crm.objects.MeetingServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.NoteService
import com.hubspot_sdk.api.services.blocking.crm.objects.NoteServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.ObjectService
import com.hubspot_sdk.api.services.blocking.crm.objects.ObjectServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.OrderService
import com.hubspot_sdk.api.services.blocking.crm.objects.OrderServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.PartnerClientService
import com.hubspot_sdk.api.services.blocking.crm.objects.PartnerClientServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.PartnerServiceService
import com.hubspot_sdk.api.services.blocking.crm.objects.PartnerServiceServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.PostalMailService
import com.hubspot_sdk.api.services.blocking.crm.objects.PostalMailServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.ProductService
import com.hubspot_sdk.api.services.blocking.crm.objects.ProductServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.QuoteService
import com.hubspot_sdk.api.services.blocking.crm.objects.QuoteServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.SchemaService
import com.hubspot_sdk.api.services.blocking.crm.objects.SchemaServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.ServiceService
import com.hubspot_sdk.api.services.blocking.crm.objects.ServiceServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.TaskService
import com.hubspot_sdk.api.services.blocking.crm.objects.TaskServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.TaxService
import com.hubspot_sdk.api.services.blocking.crm.objects.TaxServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.TicketService
import com.hubspot_sdk.api.services.blocking.crm.objects.TicketServiceImpl
import java.util.function.Consumer

class ObjectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectService {

    private val withRawResponse: ObjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calls: CallService by lazy { CallServiceImpl(clientOptions) }

    private val carts: CartService by lazy { CartServiceImpl(clientOptions) }

    private val commercePayments: CommercePaymentService by lazy {
        CommercePaymentServiceImpl(clientOptions)
    }

    private val communications: CommunicationService by lazy {
        CommunicationServiceImpl(clientOptions)
    }

    private val companies: CompanyService by lazy { CompanyServiceImpl(clientOptions) }

    private val contacts: ContactService by lazy { ContactServiceImpl(clientOptions) }

    private val contracts: ContractService by lazy { ContractServiceImpl(clientOptions) }

    private val courses: CourseService by lazy { CourseServiceImpl(clientOptions) }

    private val custom: CustomService by lazy { CustomServiceImpl(clientOptions) }

    private val dealSplits: DealSplitService by lazy { DealSplitServiceImpl(clientOptions) }

    private val deals: DealService by lazy { DealServiceImpl(clientOptions) }

    private val discounts: DiscountService by lazy { DiscountServiceImpl(clientOptions) }

    private val emails: EmailService by lazy { EmailServiceImpl(clientOptions) }

    private val feedbackSubmissions: FeedbackSubmissionService by lazy {
        FeedbackSubmissionServiceImpl(clientOptions)
    }

    private val fees: FeeService by lazy { FeeServiceImpl(clientOptions) }

    private val goalTargets: GoalTargetService by lazy { GoalTargetServiceImpl(clientOptions) }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptions) }

    private val leads: LeadService by lazy { LeadServiceImpl(clientOptions) }

    private val lineItems: LineItemService by lazy { LineItemServiceImpl(clientOptions) }

    private val listings: ListingService by lazy { ListingServiceImpl(clientOptions) }

    private val meetings: MeetingService by lazy { MeetingServiceImpl(clientOptions) }

    private val notes: NoteService by lazy { NoteServiceImpl(clientOptions) }

    private val objects: ObjectService by lazy { ObjectServiceImpl(clientOptions) }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    private val partnerClients: PartnerClientService by lazy {
        PartnerClientServiceImpl(clientOptions)
    }

    private val partnerServices: PartnerServiceService by lazy {
        PartnerServiceServiceImpl(clientOptions)
    }

    private val postalMail: PostalMailService by lazy { PostalMailServiceImpl(clientOptions) }

    private val products: ProductService by lazy { ProductServiceImpl(clientOptions) }

    private val quotes: QuoteService by lazy { QuoteServiceImpl(clientOptions) }

    private val schemas: SchemaService by lazy { SchemaServiceImpl(clientOptions) }

    private val services: ServiceService by lazy { ServiceServiceImpl(clientOptions) }

    private val tasks: TaskService by lazy { TaskServiceImpl(clientOptions) }

    private val taxes: TaxService by lazy { TaxServiceImpl(clientOptions) }

    private val tickets: TicketService by lazy { TicketServiceImpl(clientOptions) }

    override fun withRawResponse(): ObjectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService =
        ObjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calls(): CallService = calls

    override fun carts(): CartService = carts

    override fun commercePayments(): CommercePaymentService = commercePayments

    override fun communications(): CommunicationService = communications

    override fun companies(): CompanyService = companies

    override fun contacts(): ContactService = contacts

    override fun contracts(): ContractService = contracts

    override fun courses(): CourseService = courses

    override fun custom(): CustomService = custom

    override fun dealSplits(): DealSplitService = dealSplits

    override fun deals(): DealService = deals

    override fun discounts(): DiscountService = discounts

    override fun emails(): EmailService = emails

    override fun feedbackSubmissions(): FeedbackSubmissionService = feedbackSubmissions

    override fun fees(): FeeService = fees

    override fun goalTargets(): GoalTargetService = goalTargets

    override fun invoices(): InvoiceService = invoices

    override fun leads(): LeadService = leads

    override fun lineItems(): LineItemService = lineItems

    override fun listings(): ListingService = listings

    override fun meetings(): MeetingService = meetings

    override fun notes(): NoteService = notes

    override fun objects(): ObjectService = objects

    override fun orders(): OrderService = orders

    override fun partnerClients(): PartnerClientService = partnerClients

    override fun partnerServices(): PartnerServiceService = partnerServices

    override fun postalMail(): PostalMailService = postalMail

    override fun products(): ProductService = products

    override fun quotes(): QuoteService = quotes

    override fun schemas(): SchemaService = schemas

    override fun services(): ServiceService = services

    override fun tasks(): TaskService = tasks

    override fun taxes(): TaxService = taxes

    override fun tickets(): TicketService = tickets

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectService.WithRawResponse {

        private val calls: CallService.WithRawResponse by lazy {
            CallServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val carts: CartService.WithRawResponse by lazy {
            CartServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val commercePayments: CommercePaymentService.WithRawResponse by lazy {
            CommercePaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val communications: CommunicationService.WithRawResponse by lazy {
            CommunicationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val companies: CompanyService.WithRawResponse by lazy {
            CompanyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactService.WithRawResponse by lazy {
            ContactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contracts: ContractService.WithRawResponse by lazy {
            ContractServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val courses: CourseService.WithRawResponse by lazy {
            CourseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val custom: CustomService.WithRawResponse by lazy {
            CustomServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dealSplits: DealSplitService.WithRawResponse by lazy {
            DealSplitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val deals: DealService.WithRawResponse by lazy {
            DealServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val discounts: DiscountService.WithRawResponse by lazy {
            DiscountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val emails: EmailService.WithRawResponse by lazy {
            EmailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val feedbackSubmissions: FeedbackSubmissionService.WithRawResponse by lazy {
            FeedbackSubmissionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val fees: FeeService.WithRawResponse by lazy {
            FeeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val goalTargets: GoalTargetService.WithRawResponse by lazy {
            GoalTargetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceService.WithRawResponse by lazy {
            InvoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val leads: LeadService.WithRawResponse by lazy {
            LeadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lineItems: LineItemService.WithRawResponse by lazy {
            LineItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val listings: ListingService.WithRawResponse by lazy {
            ListingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val meetings: MeetingService.WithRawResponse by lazy {
            MeetingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notes: NoteService.WithRawResponse by lazy {
            NoteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val objects: ObjectService.WithRawResponse by lazy {
            ObjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val orders: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val partnerClients: PartnerClientService.WithRawResponse by lazy {
            PartnerClientServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val partnerServices: PartnerServiceService.WithRawResponse by lazy {
            PartnerServiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val postalMail: PostalMailService.WithRawResponse by lazy {
            PostalMailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val products: ProductService.WithRawResponse by lazy {
            ProductServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val quotes: QuoteService.WithRawResponse by lazy {
            QuoteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val schemas: SchemaService.WithRawResponse by lazy {
            SchemaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val services: ServiceService.WithRawResponse by lazy {
            ServiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tasks: TaskService.WithRawResponse by lazy {
            TaskServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val taxes: TaxService.WithRawResponse by lazy {
            TaxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tickets: TicketService.WithRawResponse by lazy {
            TicketServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectService.WithRawResponse =
            ObjectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calls(): CallService.WithRawResponse = calls

        override fun carts(): CartService.WithRawResponse = carts

        override fun commercePayments(): CommercePaymentService.WithRawResponse = commercePayments

        override fun communications(): CommunicationService.WithRawResponse = communications

        override fun companies(): CompanyService.WithRawResponse = companies

        override fun contacts(): ContactService.WithRawResponse = contacts

        override fun contracts(): ContractService.WithRawResponse = contracts

        override fun courses(): CourseService.WithRawResponse = courses

        override fun custom(): CustomService.WithRawResponse = custom

        override fun dealSplits(): DealSplitService.WithRawResponse = dealSplits

        override fun deals(): DealService.WithRawResponse = deals

        override fun discounts(): DiscountService.WithRawResponse = discounts

        override fun emails(): EmailService.WithRawResponse = emails

        override fun feedbackSubmissions(): FeedbackSubmissionService.WithRawResponse =
            feedbackSubmissions

        override fun fees(): FeeService.WithRawResponse = fees

        override fun goalTargets(): GoalTargetService.WithRawResponse = goalTargets

        override fun invoices(): InvoiceService.WithRawResponse = invoices

        override fun leads(): LeadService.WithRawResponse = leads

        override fun lineItems(): LineItemService.WithRawResponse = lineItems

        override fun listings(): ListingService.WithRawResponse = listings

        override fun meetings(): MeetingService.WithRawResponse = meetings

        override fun notes(): NoteService.WithRawResponse = notes

        override fun objects(): ObjectService.WithRawResponse = objects

        override fun orders(): OrderService.WithRawResponse = orders

        override fun partnerClients(): PartnerClientService.WithRawResponse = partnerClients

        override fun partnerServices(): PartnerServiceService.WithRawResponse = partnerServices

        override fun postalMail(): PostalMailService.WithRawResponse = postalMail

        override fun products(): ProductService.WithRawResponse = products

        override fun quotes(): QuoteService.WithRawResponse = quotes

        override fun schemas(): SchemaService.WithRawResponse = schemas

        override fun services(): ServiceService.WithRawResponse = services

        override fun tasks(): TaskService.WithRawResponse = tasks

        override fun taxes(): TaxService.WithRawResponse = taxes

        override fun tickets(): TicketService.WithRawResponse = tickets
    }
}
